package td.vo;

import java.io.Serializable;

public class Travel implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected int no;
  protected String attachFile01;
  protected String attachFile02;
  protected String attachFile03;
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getAttachFile01() {
    return attachFile01;
  }
  public void setAttachFile01(String attachFile01) {
    this.attachFile01 = attachFile01;
  }
  public String getAttachFile02() {
    return attachFile02;
  }
  public void setAttachFile02(String attachFile02) {
    this.attachFile02 = attachFile02;
  }
  public String getAttachFile03() {
    return attachFile03;
  }
  public void setAttachFile03(String attachFile03) {
    this.attachFile03 = attachFile03;
  }


}
