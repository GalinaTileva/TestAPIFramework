package in.reqres.model.response.singleuser;

public class UserResponse {
    private UserDetail data;
    private Support support;
    //има конструктор по подразбиране - без параметри-празен.

    public UserDetail getData() {
        return data;
    }

    public void setData(UserDetail data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
