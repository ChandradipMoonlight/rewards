package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationService {

    def welcome(params) {
        /**
         * here params will help to pass the first name and total points in url
         *
         * Ex. http://localhost:8083/whiteBoard/condition/?name=Dipak&pints=3
         */
        def firstName = params.name
        def totalPoints = params.points
        def welcomeMessage = ""

//      if (totalPoints >= 5) {
//          welcomeMessage = "Welcome back $firstName this is drink for you."
//      } else if (totalPoints == 4)
//         welcomeMessage = "Welcome back Mr. $firstName Your next drink is free"
//      else
//         welcomeMessage = "Welcome back Mr. $firstName You have $totalPoints points."
//      render(welcomeMessage)
        switch (totalPoints) {
            case 5:
                welcomeMessage = "Welcome back Mr. $firstName this is drink for you."
                break
            case 4:
                welcomeMessage = "Welcome back Mr. $firstName Your next drink is free"
                break
            case 1..3:
                welcomeMessage = "Welcome back Mr. $firstName You have $totalPoints points."
                break
            default:
                welcomeMessage = "Welcome back Mr. $firstName Thank you for registering with us."
        }
    }
}
