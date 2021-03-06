package net.qmdboss.service.impl;

import net.qmdboss.dao.InstantMessagingDao;
import net.qmdboss.entity.InstantMessaging;
import net.qmdboss.entity.InstantMessaging.InstantMessagingType;
import net.qmdboss.service.InstantMessagingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Service实现类 - 在线客服
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司,并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前,您不能将本软件应用于商业用途,否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXA46293E39B40E5C54C6BC841B973A701
 * ============================================================================
 */

@Service("instantMessagingServiceImpl")
public class InstantMessagingServiceImpl extends BaseServiceImpl<InstantMessaging, Integer> implements InstantMessagingService {

	@Resource(name = "instantMessagingDaoImpl")
	InstantMessagingDao instantMessagingDao;
	
	@Resource(name = "instantMessagingDaoImpl")
	public void setBaseDao(InstantMessagingDao instantMessagingDao) {
		super.setBaseDao(instantMessagingDao);
	}
	
	@Transactional(readOnly = true)
	public List<InstantMessaging> getInstantMessagingList(InstantMessagingType instantMessagingType, Integer maxResults) {
		return instantMessagingDao.getInstantMessagingList(instantMessagingType, maxResults);
	}

}