package model;

import lombok.Data;

import java.util.Date;

@Data
public class AbstractModel {

    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;

}
