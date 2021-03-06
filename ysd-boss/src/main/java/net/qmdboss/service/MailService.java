package net.qmdboss.service;

import net.qmdboss.entity.*;

import java.util.Map;

/**
 * Service接口 - 邮件服务
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX87B324D1BB3AC771F6FD0410911E18F1
 * ============================================================================
 */

public interface MailService {
	
	/**
	 * 根据主题、Freemarker模板文件路径、接收邮箱地址、Map数据发送邮件(异步发送)
	 * 
	 * @param subject
	 *            主题
	 * 
	 * @param templatePath
	 *            Freemarker模板文件路径
	 * 
	 * @param data
	 *            Map数据
	 *            
	 * @param toMail
	 *            收件人邮箱
	 * 
	 */
	public void sendMail(String subject, String templatePath, Map<String, Object> data, String toMail);
	
	/**
	 * 发送SMTP邮箱配置测试(同步发送)
	 * 
	 * @param smtpFromMail
	 *            发件人邮箱
	 * 
	 * @param smtpHost
	 *            SMTP服务器地址
	 *            
	 * @param smtpPort
	 *            SMTP服务器端口
	 *            
	 * @param smtpUsername
	 *            SMTP用户名
	 *            
	 * @param smtpPassword
	 *            SMTP密码
	 *            
	 * @param toMail
	 *            收件人邮箱
	 * 
	 */
	public void sendSmtpTestMail(String smtpFromMail, String smtpHost, Integer smtpPort, String smtpUsername, String smtpPassword, String toMail);
	
	/**
	 * 发送密码找回邮件
	 * 
	 * @param member
	 *            会员
	 * 
	 */
	public void sendPasswordRecoverMail(Member member);
	
	/**
	 * 发送到货通知邮件
	 * 
	 * @param goodsNotify
	 *            到货通知
	 * 
	 */
	public void sendGoodsNotifyMail(GoodsNotify goodsNotify);
	
	/**
	 * 
	 * 认证审核
	 * @param user
	 * @param verifyType 认证类别 
	 * @param verifyValue 失败/成功
	 */
	public void sendApprove(User user,Integer verifyType,Integer verifyValue);
	
	/**
	 * 满标审核
	 */
	public void sendFullBorrow(BorrowDetail borrowDetail,Borrow borrow);
	
	/**
	 * 提现审核
	 */
	public void sendWithdraw(AccountCash accountCash);
}