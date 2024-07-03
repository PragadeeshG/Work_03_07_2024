create table if not exists streaming_context(
spark_conf_id Integer not null,
spark_name Integer null,
cluster_ui varchar(255) null,
app_name varchar(255) null,
set_master varchar(255) null,
in_process_streaming varchar(255) null,
await_termination varchar(255) null,
stop_context varchar(255) null,
entity_state varchar(255) null,
constraint streaming_context_pk primary key(spark_conf_id));