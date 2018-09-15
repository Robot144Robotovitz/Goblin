package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;


public class Tree<T>{


        private T data = null;

        private List<Tree<T>> children = new ArrayList<>();

        private Tree<T> parent = null;

        private Tree<T> currentNode = null;

        public Tree(T data) {
            this.data = data;
            
        }

        public Tree<T> addChild(Tree<T> child) {
            child.setParent(this);
            this.children.add(child);
            return child;
        }

        public void addChildren(List<Tree<T>> children) {
            children.forEach(each -> each.setParent(this));
            this.children.addAll(children);
        }

        public List<Tree<T>> getChildren() {
            return children;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        private void setParent(Tree<T> parent) {
            this.parent = parent;
        }

        public Tree<T> getParent() {
            return parent;
        }

        public boolean hasChildren() {
            if (children.size() > 0)  return true;
            else return false;
        }

        public Tree<T> getChild(int i) {
            // TODO add size check
            // if (i > children.size()) throw error;
            return children.get(i);
        }


}
