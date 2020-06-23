package com.itcv.demo.sharding.config;


import com.itcv.demo.sharding.util.OrgCityCodeUtil;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;


public class MyShardingConfig implements PreciseShardingAlgorithm<String> {

	/**
	 * 精确分片算法，根据分公司code，选择表名后缀
	 * 
	 * @param availableTargetNames
	 * @param shardingValue
	 * @return
	 */
	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
		if (shardingValue.getColumnName().equalsIgnoreCase("org_code")) {
			String orgCode = shardingValue.getValue().toString();
			String suffix = OrgCityCodeUtil.getCityCodeMap().get(orgCode);
			return new StringBuffer(shardingValue.getLogicTableName()).append("_").append(suffix).toString();
			//return shardingValue.getLogicTableName() + "_" + suffix;
		}
		return null;
	}

}