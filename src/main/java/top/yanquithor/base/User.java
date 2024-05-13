package top.yanquithor.base;

public abstract class User {
    
    private String account;
    private String username;
    private String password;
    
    protected User() {}
    protected User(String account,String username,String password) {
        this.account = account;
        this.username = username;
        this.password = password;
    }
    
    public User setAccount(String account) {
        this.account = account;
        return this;
    }
    public User setUsername(String username) {
        this.username = username;
        return this;
    }
    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    
    public String getAccount() { return account; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    @Override
    public abstract String toString();
    
    public abstract String toJsonString();
    
    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof User user)) return false;
        return account.equals(user.account);
    }
    
    @Override
    public int hashCode() {
        return account.hashCode();
    }
}
