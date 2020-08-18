package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "packageGroup")
@SessionScoped
public class PackageGroup {

  private List<PackageItem> packageItems;

  private int value;

  private String idGroup;
  private String resultValue = "Created";

  public PackageGroup(String groupId, int groupName, String value, String value2) {
    this.idGroup = groupId;
    this.value = groupName;

    packageItems = new ArrayList<>();
    packageItems.add(new PackageItem(value));
    packageItems.add(new PackageItem(value2));
  }

  public PackageGroup() {
  }

  public List<PackageItem> getPackageItems() {
    return packageItems;
  }

  public void setPackageItems(List<PackageItem> packageItems) {
    this.packageItems = packageItems;
  }

  public void run() {
    doClickAction();
  }

  public void run(PackageItem p) {
    doClickAction();
    this.resultValue = p.prefix;
  }

  private void doClickAction() {
    packageItems.forEach(e -> e.setPrefix("selected!"));
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}
