package rewards

class Customer {
    String firstName
    String lastName
    Long phoneNumber
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        firstName size: 4..40, blank: false
        lastName size: 4..40, blank: false
        email blank: false, email: true
        phoneNumber size: 10..13, blank : false
        totalPoints max: 10

    }
}
