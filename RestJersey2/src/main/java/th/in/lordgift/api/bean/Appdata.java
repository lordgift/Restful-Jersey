/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.in.lordgift.api.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gift
 */
@XmlRootElement
public class Appdata {

	private Integer orderId;
	private String orderDate;
	private List<Item> items;

	public Appdata() {
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	}
