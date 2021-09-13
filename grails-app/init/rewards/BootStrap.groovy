package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB001", price: 14.95).save()
        new Product(name: "Dark Roast", sku: "DR01", price: 12.95).save()
        new Customer(phoneNumber: 8015551212, firstName: "Luther", lastName: "Allison", totalPoints: 1).save()
        new Customer(phoneNumber: 2135551212, firstName: "Bessie", lastName: "Brown", totalPoints: 2).save()
        new Customer(phoneNumber: 6055551212, firstName: "Bo", lastName: "Diddley", totalPoints: 3).save()
        new Customer(phoneNumber: 6165551212, firstName: "Leroy", lastName: "Foster", totalPoints: 4).save()
        new Customer(phoneNumber: 8015554321, firstName: "Earl", lastName: "Hooker", totalPoints: 5).save()
        new Customer(phoneNumber: 7315551212, firstName: "Maggie", lastName: "Jones", totalPoints: 5).save()
        new Customer(phoneNumber: 8185551212, firstName: "Nick", lastName: "Moss", totalPoints: 4).save()
        new Customer(phoneNumber: 7085551212, firstName: "Odie", lastName: "Payne", totalPoints: 3).save()
        new Customer(phoneNumber: 4155551212, firstName: "Jonny", lastName: "Shines", totalPoints: 2).save()
        new Customer(phoneNumber: 7225551212, firstName: "Ethel", lastName: "Waters", totalPoints: 1).save()
        new Customer(phoneNumber: 6045551212, firstName: "Scrapper", lastName: "Blackwell", totalPoints: 1).save()
        new Customer(phoneNumber: 7315551122, firstName: "Archie", lastName: "Edwards", totalPoints: 2).save()
        new Customer(phoneNumber: 5145551212, firstName: "Jessie", lastName: "Fuller", totalPoints: 3).save()
        new Customer(phoneNumber: 4085551212, firstName: "Ida", lastName: "Goodson", totalPoints: 4).save()
        new Customer(phoneNumber: 8015551234, firstName: "Bumble Bee", lastName: "Smith", totalPoints: 5).save()
        new Customer(phoneNumber: 4315551212, firstName: "Sippie", lastName: "Wallace", totalPoints: 4).save()
    }
    def destroy = {
    }
}
