package net.occp.base.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 *
 * @author maurizio
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

    private String response;
    private DataDTO data;
    private ErrorDTO error;

    public String getResponse() {
	return response;
    }

    public void setResponse(String response) {
	this.response = response;
    }

    public DataDTO getData() {
	return data;
    }

    public void setData(DataDTO data) {
	this.data = data;
    }

    public ErrorDTO getError() {
	return error;
    }

    public void setError(ErrorDTO error) {
	this.error = error;
    }

}
