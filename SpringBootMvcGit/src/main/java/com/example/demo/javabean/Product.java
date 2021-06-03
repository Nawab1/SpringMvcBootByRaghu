package com.example.demo.javabean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="PRODUCTTAB")
public class Product implements Serializable{
@Id
@GeneratedValue
private Integer pId;
private String pCode;
private String pName;
private double pCost;
private String gst;
private String note;
}
