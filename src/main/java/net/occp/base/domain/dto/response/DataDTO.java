package net.occp.base.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author maurizio
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDTO {

    private String dataResponse;

    public String getDataResponse() {
        return dataResponse;
    }

    public void setDataResponse(String dataResponse) {
        this.dataResponse = dataResponse;
    }

}
