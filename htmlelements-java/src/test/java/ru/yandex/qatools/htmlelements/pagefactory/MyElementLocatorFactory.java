package ru.yandex.qatools.htmlelements.pagefactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.pagefactory.ClassElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementClassAnnotations;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementFieldAnnotations;

import java.lang.reflect.Field;

public class MyElementLocatorFactory implements ClassElementLocatorFactory {
    private final SearchContext searchContext;

    public MyElementLocatorFactory(SearchContext searchContext) {
        this.searchContext = searchContext;
    }

    public ElementLocator createLocator(Field field) {
        return new MyElementLocator(searchContext, new HtmlElementFieldAnnotations(field));
    }

    public ElementLocator createLocator(Class clazz) {
        return new MyElementLocator(searchContext, new HtmlElementClassAnnotations(clazz));
    }

}
