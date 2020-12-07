package com.bjpowernode.domain;
public class Goods {
    private String id;
    private String cid;
    private String name;
    private String marketprice;
    private String estoreprice;
    private String num;
    private String imgurl;
    private String ishot;
    private String status;
    private String createtime;
    private String description;
    private Category category;

   public Category getCategory() {
      return category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getCid() {
      return cid;
   }

   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getMarketprice() {
      return marketprice;
   }

   public void setMarketprice(String marketprice) {
      this.marketprice = marketprice;
   }

   public String getEstoreprice() {
      return estoreprice;
   }

   public void setEstoreprice(String estoreprice) {
      this.estoreprice = estoreprice;
   }

   public String getNum() {
      return num;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getImgurl() {
      return imgurl;
   }

   public void setImgurl(String imgurl) {
      this.imgurl = imgurl;
   }

   public String getIshot() {
      return ishot;
   }

   public void setIshot(String ishot) {
      this.ishot = ishot;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getCreatetime() {
      return createtime;
   }

   public void setCreatetime(String createtime) {
      this.createtime = createtime;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
   @Override
   public String toString() {
      return "Goods{" +
              "id='" + id + '\'' +
              ", cid='" + cid + '\'' +
              ", name='" + name + '\'' +
              ", marketprice='" + marketprice + '\'' +
              ", estoreprice='" + estoreprice + '\'' +
              ", num='" + num + '\'' +
              ", imgurl='" + imgurl + '\'' +
              ", ishot='" + ishot + '\'' +
              ", status='" + status + '\'' +
              ", createtime='" + createtime + '\'' +
              ", description='" + description + '\'' +
              ", category=" + category +
              '}';
   }
}
