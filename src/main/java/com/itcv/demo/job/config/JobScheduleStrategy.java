/*
package com.itcv.demo.job.config;

import com.dangdang.ddframe.job.lite.api.strategy.JobInstance;
import com.dangdang.ddframe.job.lite.api.strategy.JobShardingStrategy;

import java.util.*;

*/
/**
 * 小药药自定义分片策略 每一个任务只有一个分片，单个分片随机分配到一台机器上执行
 * 
 * @author wulinli
 * @date 2018/08/16
 *//*

public class JobScheduleStrategy implements JobShardingStrategy {

	private final Random random = new Random();

	@Override
	public Map<JobInstance, List<Integer>> sharding(final List<JobInstance> jobInstances, final String jobName,
			final int shardingTotalCount) {
		if (jobInstances.isEmpty()) {
			return Collections.emptyMap();
		}
		System.out.println("========================XyyJobScheduleStrategy====================");
		Map<JobInstance, List<Integer>> result = getSharding(jobInstances);
		return result;
	}

	*/
/**
	 * 单个分片 随机分配到一个jobstance
	 * 
	 * @param shardingUnits
	 * @param shardingTotalCount
	 * @return
	 *//*

	private Map<JobInstance, List<Integer>> getSharding(final List<JobInstance> shardingUnits) {
		Map<JobInstance, List<Integer>> result = new HashMap<>();
		*/
/* 因为只有一个分片，所以直接分配为 0 号分片 *//*

		List<Integer> list = new ArrayList<>();
		list.add(new Integer(0));
		int size = shardingUnits.size();
		*/
/* 获取jobinstance下标 *//*

		int index = random.nextInt(size);
		*/
/* 得到分配的jobinstance *//*

		JobInstance jobInstance = shardingUnits.get(index);
		result.put(jobInstance, list);
		return result;
	}
}
*/
