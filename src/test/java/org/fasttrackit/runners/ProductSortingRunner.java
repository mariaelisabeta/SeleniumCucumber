package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@CucumberOptions(
        plugin = {"html:target/cucumber", "json:target/products-sorting.json"},
        glue={"org.fasttrackit"},
        features={"src/test/resources/features/products-sorting.feature"}
)


@RunWith(Cucumber.class)
public class ProductSortingRunner {

}
