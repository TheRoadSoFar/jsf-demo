package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "packageItem")
@SessionScoped
public class PackageItem {


  public boolean selected;
  public String prefix;

  public PackageItem(String prefix) {
    this.prefix = prefix;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
    setPrefix("selected after submit");
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

}