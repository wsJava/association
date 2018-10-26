package top.lvjp.association.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AssociationInfo {

    /**
     * 社团编号
     */
    @JsonProperty("id")
    private Integer associationId;

    /**
     * 社团名称
     */
    @JsonProperty("name")
    private String associationName;

    /**
     * 社团简介
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("description")
    private String associationDescription;

    /**
     * 社团logo
     */
    @JsonProperty("icon")
    private String associationIcon;

}