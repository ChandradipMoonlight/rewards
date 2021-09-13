package rewards

class OnlineOrder {
    Date orderDate
    Integer orderNumber
    Float orderTotal
    static belongsTo = [customers:Customer]
    static hasMany = [orderItems:OrderItem]

    static constraints = {
    }
}
