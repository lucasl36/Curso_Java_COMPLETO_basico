package com.lucasl36.cursojavacompleto.entities.mod13.shop;

/**
 *
 * @author Lucas Lopes
 */
public enum OrderStatus {
    
        PENDING_PAYMENT(0, "Pending Payment"),
        PROCESSING(1, "Processing"),
        SHIPPED(2, "Shipped"),
        DELIVERED(3, "Delivered"),
        CANCELED(4, "Canceled");
        
        private Integer code;
        private String label;
        
        private OrderStatus(Integer code, String label) {
           this.code = code;
           this.label = label;
        }
        
        public String toString() {
            return this.label;
        }
        
        public Integer getCode() {
            return this.code;
        }
        
        public OrderStatus toEnum(Object o) throws Exception {
            for(OrderStatus order : OrderStatus.values()) {
                if(order.getCode().equals(o) || order.toString().equals(o)) {
                    return order;
                }
            }
            return null;
        }
        
}
