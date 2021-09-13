package rewards

class InventoryController {

    def index() {
        render("Here is a list of everything.")
    }

    def edit() {
        def productName= "Breakfast Blend"
        def sku = "BB01"
        [product:productName, sku:sku]
    }

    def remove() {
        render "<h1>You have less than before.</h1>"
    }

    def get() {
        def allProduct = Product.list()
        [allProducts: allProduct]
    }
}
