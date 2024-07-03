create table if not exists spark_batches(
core_api varchar(255) not null,
batch_code varchar(255) null,
tcp_socket varchar(255) null,
udp_transfer_code varchar(255) null,
map_function bigint null,
reduce_function varchar(255) null,
join_function varchar(255) null,
window_function bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint spark_batches_pk primary key(core_api));