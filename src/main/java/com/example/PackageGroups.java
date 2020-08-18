package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ManagedBean(name = "packageGroups")
@SessionScoped
public class PackageGroups {

  private List<PackageGroup> packageGroupList;

  public PackageGroups() {
    packageGroupList = new ArrayList<>();
    packageGroupList.add(new PackageGroup("100", -1, "one", "two"));
    packageGroupList.add(new PackageGroup("200", -2, "three", "four"));
  }

  public void moveBack() {
    packageGroupList.clear();
    packageGroupList.add(new PackageGroup("100", -1, "one", "two"));
    packageGroupList.add(new PackageGroup("200", -2, "three", "four"));
  }

  public List<PackageGroup> getPackageGroupList() {
    return packageGroupList;
  }

  public void setPackageGroupList(List<PackageGroup> packageGroupList) {
    this.packageGroupList = packageGroupList;
  }

}
