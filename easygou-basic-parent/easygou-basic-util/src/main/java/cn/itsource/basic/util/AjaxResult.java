package cn.itsource.basic.util;
//公共的方法，将返回的信息封装成一个ajax对象
public class AjaxResult {

    private boolean success;

    private String message;

    private Object restObj;

    private Integer errorCode;
//私有化
    private AjaxResult(){}
//提供静态方法
    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }


    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getRestObj() {
        return restObj;
    }

    public Object setRestObj(Object restObj) {
        this.restObj = restObj;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
