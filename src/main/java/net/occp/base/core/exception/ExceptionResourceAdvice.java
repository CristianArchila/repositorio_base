package net.occp.base.core.exception;

import net.occp.base.core.utils.enums.ResponseEnum;
import net.occp.base.domain.dto.response.ErrorDTO;
import net.occp.base.domain.dto.response.ResponseDTO;
import net.occp.base.service.impl.BaseService;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionResourceAdvice extends BaseService {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseDTO handleBusinessException(BusinessException exception) {
        printPartialBusinessException(exception);
        return createErrorResponse(exception.getExceptionCode(), exception.getExceptionMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseDTO handleException(Exception exception) {
        log.info("service has ended by exception {0}", exception);
        printStackTrace(exception);
        BusinessException businessException = new BusinessException();
        return createErrorResponse(businessException.getExceptionCode(), businessException.getExceptionMessage());
    }

    private ResponseDTO createErrorResponse(String code, String message) {
        ErrorDTO error = new ErrorDTO();
        error.setCode(code);
        error.setMessage(message);

        ResponseDTO response = new ResponseDTO();
        response.setError(error);
        response.setResponse(ResponseEnum.KO.getValue());
        return response;
    }

    private void printPartialBusinessException(BusinessException e) {
        log.warn("[business exception] {} : {} in: ", e.getExceptionCode(), e.getExceptionMessage());
        int count = 0;
        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            log.warn("[line] {} : {}", stackTraceElement.getClassName(), stackTraceElement.getLineNumber());
            if (++count >= 3) {
                break;
            }
        }
    }
}
