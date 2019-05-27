package lesson12;

import core.BrowserFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lolik on 23.05.2019
 */
public class TestSearch extends BrowserFactory {



    @Test
    public void search(){
        SearchForm searchForm = new GoogleSearch();
        List<String> results = searchForm.search("Jack Sparrow");
        System.out.println(results);

        searchForm = new BingSearch();
        results = searchForm.search("Jack Sparrow");
        System.out.println(results);
    }





}
