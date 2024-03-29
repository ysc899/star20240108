package kr.co.seesoft.nemo.starnemoapp.nemoapi.po;


/**
 * 행낭 발송 목록 조회 PO
 */
public class NemoBagSendListPO {
    /** id */
    private String userId;

    private String deptCd;
    
    /**
     *  조회 일자 ( YYYYMMDD )
     * */
    private String sendDt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getSendDt() {
        return sendDt;
    }

    public void setSendDt(String sendDt) {
        this.sendDt = sendDt;
    }

    @Override
    public String toString() {
        return "NemoBagSendListPO{" +
                "userId='" + userId + '\'' +
                ", deptCd='" + deptCd + '\'' +
                ", sendDt='" + sendDt + '\'' +
                '}';
    }
}
