package rewards

class Award {
    Date awardDate
    String type
    Integer point
    static belongsTo = [costmers:Customer]

    static constraints = {
        type inList: ["Purchase", "Reward"]
    }
}
