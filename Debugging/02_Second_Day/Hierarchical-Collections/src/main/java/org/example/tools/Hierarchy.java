package org.example.tools;


import org.example.model.abstraction.IHaveHierarchicalStructure;

public class Hierarchy <TItem extends IHaveHierarchicalStructure<TItem>> {
    private TItem rootElement;
    public void setRootElement(TItem rootGeography){
    this.rootElement = rootGeography;
    }

    private int result;
    public TItem findElementById(int i){
        this.result=i;
        if(rootElement.getId()==i){
            return rootElement;
        }
        return szukajdzieciaka(rootElement);
    }
    private TItem szukajdzieciaka(TItem item){
        for (TItem element:item.getChildren()) {
            if(element.getId()==result){
                return element;
            }
            else if(!item.getChildren().isEmpty()){
                TItem resulten = szukajdzieciaka(element);
                if(resulten != null)
                    return resulten;
            }
        }
        return null;
    }

}
