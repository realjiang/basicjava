package src._07thread._5synchronized._1bankdemo;

/**
 * 同步方法：保证每一个方法执行过程中不会被打断
 */
public class Bank {
	private String account;// 账号
	private int balance;// 账户余额

	public Bank(String account, int balance) {
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [账号：" + account + ", 余额：" + balance + "]";
	}

	/**
	 * 存款
	 */
	public synchronized void saveAccount() { //同步成员方法

		// 获取当前的账号余额
		int balance = getBalance();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 修改余额，存100元
		balance += 100;
		// 修改账户余额
		setBalance(balance);
		// 输出存款后的账户余额
		System.out.println("存款后的账户余额为：" + balance);
	}

	/**
	 * 取款
	 */
	public void drawAccount() {
		synchronized (this) { //同步语句块，参数是要同步的对象
			// 在不同的位置处添加sleep方法

			// 获得当前的帐户余额
			int balance = getBalance();
			// 修改余额，取200
			balance = balance - 200;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 修改帐户余额
			setBalance(balance);
			System.out.println("取款后的帐户余额：" + balance);
		}

	}
}
