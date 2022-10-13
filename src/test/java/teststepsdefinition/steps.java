package teststepsdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagestructure.cartPage;
import pagestructure.dashboardPage;
import pagestructure.searchPage;
import pagestructure.womanPage;


public class steps {
	
	
	dashboardPage dashboard =  new dashboardPage(driverUtilities.driver);
	searchPage search = new searchPage(driverUtilities.driver);
	womanPage woman = new womanPage(driverUtilities.driver);
	cartPage cart = new cartPage(driverUtilities.driver);

	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	   dashboard.verify_dashboard_URL();
	}

	@Given("user put any search {string} term in the search bar")
	public void user_put_any_search_term_in_the_search_bar(String item){
	   dashboard.entersearchitem(item);
	}

	@When("user click search button")
	public void user_click_search_button() throws InterruptedException {
	   dashboard.clicksearch();

	}

	@Then("user is able to see the searched item {string}")
	public void user_is_able_to_see_the_searched_item(String item1) {
	    
		search.verify_items(item1);
	    
	}

	@Given("user click on Women category")
	public void user_click_on_women_category() {
	   dashboard.clickwomen();
	}

	@When("user select any value from the Color and Category filter item")
	public void user_select_any_value_from_the_color_and_category_filter_item() throws InterruptedException {
	   woman.clickTops();
	   Thread.sleep(10000);
	   woman.clickWhite();
	   Thread.sleep(10000);
	}

	@Then("the results returned matches the filter criteria")
	public void the_results_returned_matches_the_filter_criteria() {
	    woman.verify_cat();
		woman.verify_items();
		woman.verify_filter_URL();
	}
	
	@When("user select {string} from the POPULAR section and add them to the cart")
	public void user_select_any_item_from_the_popular_section_and_add_them_to_the_cart(String Product) throws InterruptedException {
	    dashboard.clickpopular();
	    Thread.sleep(5000);
	    dashboard.hoveritem(Product);
	    Thread.sleep(5000);
	    //dashboard.additem();
	    //Thread.sleep(5000);
	    dashboard.verifywindow();
	    Thread.sleep(5000);
	    dashboard.proceed();
	    Thread.sleep(5000);
	}

	@Then("Validate that {string} has successfully been added to the cart")
	public void validate_that_the_item_has_successfully_been_added_to_the_cart(String Product) {
	    cart.verify_quantity();
	    cart.verify_product(Product);
	}

}
