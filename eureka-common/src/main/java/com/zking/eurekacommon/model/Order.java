package com.zking.eurekacommon.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable{
    private Long orderId;
    private String orderNo;
    private Date createDate;
}
