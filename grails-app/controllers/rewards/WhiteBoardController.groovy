package rewards


class WhiteBoardController {
   def calculationService

//    def index() { }
   def variable() {
      def myTotal = 1
      render("Total: "+myTotal)
      render("<br>"+myTotal.class)

      myTotal = myTotal + 1
      render("</br>New Date: " + myTotal + "</br>")


      def firstName = "Chandradip"
      render("<h1>Name: ${firstName}</h1>")
      render(firstName.class)

      def today = new Date("12/10/2020")
      render("</br>today: " +today)
      render("</br>"+today.class)
      today = today + 1
      render("</br>New Date: " + today + "</br>")
   }
   def string() {
      def first = "Chandradip"
      def last = "Shivankar"
      render "Welcome Back" +" " + first + " " +  last + " You have 3 points."
      render "<br>Welcome back ${first} ${last} You have 4 points. "
      render "<br>Hey there $first you are win."
      render "Today is ${new Date()}"
      def  fullName = "DIPAK"
      render "Your name is ${fullName.toLowerCase()}"
   }
   def condition() {
      def welcomeMessage = calculationService.welcome(params)
      render welcomeMessage
   }
}
