package net.qmdboss.util;

import net.qmdboss.service.GoodsService;
import net.qmdboss.service.ProductService;
import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 工具类 - 编号生成
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX787FFCC36E180DE4F1B69B523E9FA2EE
 * ============================================================================
 */

public class SerialNumberUtil {
	
	public static final String GOODS_SN_PREFIX = "SN_";// 商品编号前缀
	public static final String PRODUCT_SN_PREFIX = "SN_";// 货品编号前缀
	
	public static final String ORDER_SN_PREFIX = "";// 订单编号前缀
	public static final long ORDER_SN_FIRST = 100000L;// 订单编号起始数
	public static final long ORDER_SN_STEP = 1L;// 订单编号步长
	
	public static final String PAYMENT_SN_PREFIX = "";// 支付编号前缀
	public static final long PAYMENT_SN_FIRST = 100000L;// 支付编号起始数
	public static final long PAYMENT_SN_STEP = 1L;// 支付编号步长
	
	public static final String REFUND_SN_PREFIX = "";// 退款编号前缀
	public static final long REFUND_SN_FIRST = 100000L;// 退款编号起始数
	public static final long REFUND_SN_STEP = 1L;// 退款编号步长
	
	public static final String SHIPPING_SN_PREFIX = "";// 发货编号前缀
	public static final long SHIPPING_SN_FIRST = 100000L;// 发货编号起始数
	public static final long SHIPPING_SN_STEP = 1L;// 发货编号步长
	
	public static final String RESHIP_SN_PREFIX = "";// 退货编号前缀
	public static final long RESHIP_SN_FIRST = 100000L;// 退货编号起始数
	public static final long RESHIP_SN_STEP = 1L;// 退货编号步长
	
	public static Long lastOrderSnNumber;
	public static Long lastPaymentSnNumber;
	public static Long lastRefundSnNumber;
	public static Long lastShippingSnNumber;
	public static Long lastReshipSnNumber;

	static {
		// 订单编号
//		OrderService orderService = (OrderService) SpringUtil.getBean("orderServiceImpl");
//		String lastOrderSn = orderService.getLastOrderSn();
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMddHHmmss");
		String lastOrderSn= simple.format(new Date()) + CommonUtil.getRandomString(5);
		
		if (StringUtils.isNotEmpty(lastOrderSn)) {
			lastOrderSnNumber = Long.parseLong(StringUtils.removeStartIgnoreCase(lastOrderSn, ORDER_SN_PREFIX));
		} else {
			lastOrderSnNumber = ORDER_SN_FIRST;
		}
		
		// 支付编号
//		PaymentService paymentService = (PaymentService) SpringUtil.getBean("paymentServiceImpl");
//		String lastPaymentSn = paymentService.getLastPaymentSn();
//		if (StringUtils.isNotEmpty(lastPaymentSn)) {
//			lastPaymentSnNumber = Long.parseLong(StringUtils.removeStartIgnoreCase(lastPaymentSn, PAYMENT_SN_PREFIX));
//		} else {
//			lastPaymentSnNumber = PAYMENT_SN_FIRST;
//		}
		
		lastPaymentSnNumber =Long.parseLong( simple.format(new Date()) + CommonUtil.getRandomString(5));
		
		
		// 退款编号
//		RefundService refundService = (RefundService) SpringUtil.getBean("refundServiceImpl");
//		String lastRefundSn = refundService.getLastRefundSn();
		String lastRefundSn= simple.format(new Date()) + CommonUtil.getRandomString(5);
		if (StringUtils.isNotEmpty(lastRefundSn)) {
			lastRefundSnNumber = Long.parseLong(StringUtils.removeStartIgnoreCase(lastRefundSn, REFUND_SN_PREFIX));
		} else {
			lastRefundSnNumber = REFUND_SN_FIRST;
		}
		
		// 发货编号
//		ShippingService shippingService = (ShippingService) SpringUtil.getBean("shippingServiceImpl");
//		String lastShippingSn = shippingService.getLastShippingSn();
		String lastShippingSn= simple.format(new Date()) + CommonUtil.getRandomString(5);
		if (StringUtils.isNotEmpty(lastShippingSn)) {
			lastShippingSnNumber = Long.parseLong(StringUtils.removeStartIgnoreCase(lastShippingSn, SHIPPING_SN_PREFIX));
		} else {
			lastShippingSnNumber = SHIPPING_SN_FIRST;
		}
		
		// 退货编号
//		ReshipService reshipService = (ReshipService) SpringUtil.getBean("reshipServiceImpl");
//		String lastReshipSn = reshipService.getLastReshipSn();
		String lastReshipSn= simple.format(new Date()) + CommonUtil.getRandomString(5);
		if (StringUtils.isNotEmpty(lastReshipSn)) {
			lastReshipSnNumber = Long.parseLong(StringUtils.removeStartIgnoreCase(lastReshipSn, RESHIP_SN_PREFIX));
		} else {
			lastReshipSnNumber = RESHIP_SN_FIRST;
		}
	}
	
	/**
	 * 生成商品编号
	 * 
	 * @return 商品编号
	 */
	public static String buildGoodsSn() {
		GoodsService goodsService = (GoodsService) SpringUtil.getBean("goodsServiceImpl");
		String goodsSn;
		do {
			String uuid = UUID.randomUUID().toString();
			goodsSn = GOODS_SN_PREFIX + (uuid.substring(0, 8) + uuid.substring(9, 13)).toUpperCase();
		} while (goodsService.isExistByGoodsSn(goodsSn));
		return goodsSn;
	}
	
	/**
	 * 生成货品编号
	 * 
	 * @return 商品编号
	 */
	public static String buildProductSn() {
		ProductService productService = (ProductService) SpringUtil.getBean("productServiceImpl");
		String productSn;
		do {
			String uuid = UUID.randomUUID().toString();
			productSn = PRODUCT_SN_PREFIX + (uuid.substring(0, 8) + uuid.substring(9, 13)).toUpperCase();
		} while (productService.isExistByProductSn(productSn));
		return productSn;
	}
	
	/**
	 * 生成订单编号
	 * 
	 * @return 订单编号
	 */
	public synchronized static String buildOrderSn() {
		lastOrderSnNumber += ORDER_SN_STEP;
		return ORDER_SN_PREFIX + lastOrderSnNumber;
	}
	
	/**
	 * 生成支付编号
	 * 
	 * @return 支付编号
	 */
	public synchronized static String buildPaymentSn() {
//		lastPaymentSnNumber += PAYMENT_SN_STEP;
		SimpleDateFormat simple = new SimpleDateFormat("yyyyMMddHHmmss");
		lastPaymentSnNumber = Long.parseLong( simple.format(new Date()) + CommonUtil.getRandomString(5));
		
		return PAYMENT_SN_PREFIX + lastPaymentSnNumber;
	}
	
	/**
	 * 生成退款编号
	 * 
	 * @return 退款编号
	 */
	public synchronized static String buildRefundSn() {
		lastRefundSnNumber += REFUND_SN_STEP;
		return REFUND_SN_PREFIX + lastRefundSnNumber;
	}
	
	/**
	 * 生成发货编号
	 * 
	 * @return 发货编号
	 */
	public synchronized static String buildShippingSn() {
		lastShippingSnNumber += SHIPPING_SN_STEP;
		return SHIPPING_SN_PREFIX + lastShippingSnNumber;
	}
	
	/**
	 * 生成退货编号
	 * 
	 * @return 退货编号
	 */
	public synchronized static String buildReshipSn() {
		lastReshipSnNumber += RESHIP_SN_STEP;
		return RESHIP_SN_PREFIX + lastReshipSnNumber;
	}

}