package com.feng.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Event {
	private Integer id;
	private Integer rawEventId;
	private String host;
	private String ip;
	private String source;
	private String type;
	private Date startTime;
	private Date endTime;
	private String content;
	private String dataType;
	private String suggest;
	private Integer businessSystemId;
	private Integer departmentId;
	private String status;
	private Integer occurCount;
	private String owner;
	private Date responsedTime;
	private String responsedBy;
	private Date resolvedTime;
	private String resolvedBy;
	private Date closedTime;
	private String closedBy;
}