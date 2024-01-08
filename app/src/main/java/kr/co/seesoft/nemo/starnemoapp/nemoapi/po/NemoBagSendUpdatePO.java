package kr.co.seesoft.nemo.starnemoapp.nemoapi.po;


/**
 * 행낭 발송 수정 PO
 */
public class NemoBagSendUpdatePO {
    /** 행낭발송일자 */
    private String cpbgSendDt;

    /** 행낭발송부서코드 */
    private String cpbgSendDeptCd;

    /** 행낭차수코드(1:1차, 2:2차: 3:3차) */
    private String cpbgDegCd;

    /** 행낭수량 */
    private String cpbgQty;

    /** 행낭발송특이사항 */
    private String cpbgSendCont;

    /** 발송자 */
    private String userId;


    public String getCpbgSendDt() {
        return cpbgSendDt;
    }

    public void setCpbgSendDt(String cpbgSendDt) {
        this.cpbgSendDt = cpbgSendDt;
    }

    public String getCpbgSendDeptCd() {
        return cpbgSendDeptCd;
    }

    public void setCpbgSendDeptCd(String cpbgSendDeptCd) {
        this.cpbgSendDeptCd = cpbgSendDeptCd;
    }

    public String getCpbgDegCd() {
        return cpbgDegCd;
    }

    public void setCpbgDegCd(String cpbgDegCd) {
        this.cpbgDegCd = cpbgDegCd;
    }

    public String getCpbgQty() {
        return cpbgQty;
    }

    public void setCpbgQty(String cpbgQty) {
        this.cpbgQty = cpbgQty;
    }

    public String getCpbgSendCont() {
        return cpbgSendCont;
    }

    public void setCpbgSendCont(String cpbgSendCont) {
        this.cpbgSendCont = cpbgSendCont;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NemoBagSendUpdatePO{" +
                "cpbgSendDt='" + cpbgSendDt + '\'' +
                ", cpbgSendDeptCd='" + cpbgSendDeptCd + '\'' +
                ", cpbgDegCd='" + cpbgDegCd + '\'' +
                ", cpbgQty='" + cpbgQty + '\'' +
                ", cpbgSendCont='" + cpbgSendCont + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
