create table if not exists discretized_streams(
d_stream_code bigint not null,
graph_processing_cat_code varchar(255) null,
graph_processing_sub_cat_code varchar(255) null,
continuous_stream varchar(255) null,
input_source varchar(255) null,
immutable_source varchar(255) null,
undelying_rds varchar(255) null,
lines_d_stream bigint null,
words_d_stream Integer null,
sequence_code varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint discretized_streams_pk primary key(d_stream_code));