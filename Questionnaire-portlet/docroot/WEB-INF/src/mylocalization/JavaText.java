package mylocalization;
import myutil.TextUtil;;

/**
 * Java端訊息本地化.
 * @author Jason
 */
public enum JavaText {
  /**
   * 非常满意.
   */
  VERY_SATISFIED("very-satisfied"),
  /**
   * 满意.
   */
  SATISFIED("satisfied"),
  /**
   * 比较满意.
   */
  SO_SO("so-so"),
  /**
   * 不满意.
   */
  NOT_SATISFIED("not-satisfied"),
  /**
   * 很差.
   */
  SO_BAD("so-bad"),
  /**
   * 1.产品的打印质量，是否满意？.
   */
  QUESTION_1("question1"),
  /**
   * 2.系统资料处理(如：模板修改或临时需求)，是否满意？.
   */
  QUESTION_2("question2"),
  /**
   * 3.生产时效，是否满意？.
   */
  QUESTION_3("question3"),
  /**
   * 4.生产异常状况的处理结果，是否满意？.
   */
  QUESTION_4("question4"),
  /**
   * 5.抱怨或投诉后处理的品质，是否满意？.
   */
  QUESTION_5("question5"),
  /**
   * 6.产品外包装的完整性，是否满意？.
   */
  QUESTION_6("question6"),
  /**
   * 7.物流配送时效，是否满意？.
   */
  QUESTION_7("question7"),
  /**
   * 8.现场工作人员的服务态度和协调能力，是否满意？.
   */
  QUESTION_8("question8"),
  /**
   * 9.打印设备的稳定姓(故障叫修率)，是否满意？.
   */
  QUESTION_9("question9"),
  /**
   * 10.设备维修人员的服务态度和维修水平，是否满意？.
   */
  QUESTION_10("question10"),
  /**
   * 11.您的意见和建议(不满意事项可简述)：.
   */
  QUESTION_11("question11"),
  /**
   * 公司名称：.
   */
  COMPANY_NAME("company-name"),
  /**
   * 联系人：.
   */
  CONTACT_PERSON("contact-person"),
  /**
   * 联系方式：.
   */
  CONTACT_METHOD("contact-method"),
  /**
   * 填表日期：.
   */
  FILL_DATE("fill-date"),
  /**
   * 提交答卷.
   */
  SUBMIT_BUTTON("submit-button");

//-------------properties key and return function-----------------//
  /**
   * properties key.
   */
  private String propKey;

  /**
   * constructor.
   * @param str key name
   */
  JavaText(String str) {
    this.propKey = str;
  }

  /**
   * get message in properties.
   * @return message
   */
  public String value() {
    return TextUtil.getText(propKey);
  }
}
