package com.qmd.util;

import java.util.ResourceBundle;

public class ConfigUtil {

	/** 网址 例:http://127.0.0.1:8080/qmd/ */
	public static final String QMD_BASEURL = "qmd.baseUrl";
	/** 网站静态地址 例:http://127.0.0.1:8080/qmd/static/ */
	public static final String QMD_STATIC_BASEURL = "qmd.static.baseUrl";
	/** 网站内容地址 例:http://127.0.0.1:8080/qmd/content/ */
	public static final String QMD_CONTENT_BASEURL = "qmd.content.baseUrl";
	/** 图片地址 例 :http://127.0.0.1:8080/qmd/img/ */
	public static final String QMD_IMG_BASEURL = "qmd.img.baseUrl";
	/** 图片发布 例 :/qmd/img/ (要与tomcat中的context一致)*/
	public static final String QMD_IMG_CONTEXT_PATH = "qmd.img.context.path";
	/** 跳转的根目录 */
	public static final String QMD_INTERCEPT_SENDREDIRECT = "qmd.intercept.sendRedirect";
	/** 图片地址 例 :http://127.0.0.1:8080 */
	public static final String QMD_SITE_URL = "qmd.site.url";
	/** 网站名称 例:网贷 */
	public static final String QMD_SITE_NAME = "qmd.site.name";
	/** 图片上传保存路径 */
	public static final String QMD_UPLOAD_IMG_DIR = "qmd.upload.img.dir";
	/** 手机图片上传保存路径 */
	public static final String QMD_UPLOAD_IMG_MOBILE = "qmd.upload.img.mobile";
	
	/** 水印图片位置 */
	public static final String QMD_WATERMARK_POSITION = "qmd.watermark.position";
	/** 水印图片 */
	public static final String QMD_WATERMARK_FILE = "qmd.watermark.file";
	/** 水印透明度 */
	public static final String QMD_WATERMARK_ALPHA = "qmd.watermark.alpha";
	
	public static final String PFX_PATH = "pfx.path";
	public static final String PFX_PWD= "pfx.pwd";
	public static final String CER_PATH = "cer.path";
	public static final String DATA_TYPE = "dataType";
	
	

	public String get(String key) {
		return bundle.getString(key);
	}

	private static ConfigUtil configUtil;
	private static ResourceBundle bundle = ResourceBundle
			.getBundle("qmd");

	public static ConfigUtil getConfigUtil() {
		if (configUtil != null) {
			return configUtil;
		} else {
			configUtil = new ConfigUtil();
			bundle = ResourceBundle.getBundle("qmd");

			return configUtil;
		}
	}
	
	/**
     * 返回部署环境
     * @return
     */
    public static String getRuntimeEnv() {
        String runtimeDev = ConfigUtil.getConfigUtil().get("qmd.runtime.env");
        return runtimeDev;
    }
    
	 /**
     * 是否生产环境
     * @return
     */
    public static boolean isProdEnv() {
        return "prod".equals(getRuntimeEnv());
    }

}
