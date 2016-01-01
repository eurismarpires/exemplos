package com.eurismar;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "order")
@SessionScoped
public class OrderBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Order> orderList;


    public OrderBean() {
        orderList = new ArrayList<>();
        orderList.add(new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
        orderList.add(new Order("A0002", "Harddisk 10TB",new BigDecimal("522.00"), 1));
        orderList.add(new Order("A0003", "Dell Laptop",new BigDecimal("11132.00"), 1));
        orderList.add(new Order("A0004", "Samsung LCD",new BigDecimal("5230.00"), 1));
        orderList.add(new Order("A0005", "A4Tech Mouse",new BigDecimal("132.00"), 1));
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList2) {
        this.orderList = orderList;
    }
  
   
    public static class Order {

        String orderNo;
        String productName;
        BigDecimal price;
        int qty;

        public Order(String orderNo, String productName,
                BigDecimal price, int qty) {

            this.orderNo = orderNo;
            this.productName = productName;
            this.price = price;
            this.qty = qty;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        
    }
}
