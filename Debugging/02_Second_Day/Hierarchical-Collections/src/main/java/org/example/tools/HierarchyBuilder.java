package org.example.tools;


import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;


public class HierarchyBuilder<TItem extends IHaveHierarchicalStructure<TItem>> {
    private List<TItem> elements = new ArrayList<>();
    private TItem rootElement;

    public void setElements(List<TItem> list){
        elements = list;
    }

    public void buildHierarchy(){
        for (TItem item:elements) {
            if(item.getParentId()==null) {
                rootElement = item;
                item.setParent(null);
            }
            else {
                item.setParent(findParent(item.getParentId()));

            }
            addChildren(item);


        }
    }

    public  TItem getRootElement(){
        return this.rootElement;
    }


    private TItem findParent(int parentId){
        for (TItem item:elements) {
            if(parentId==item.getId()){
                return item;
            }

        }
        return null;
    }

    private void addChildren(TItem item){
        for (TItem element:elements) {
            if(element==rootElement){

            }
            else if(item.getId()==element.getParentId()){
                item.getChildren().add(element);
            }
        }
    }

}
