SELECT CONSTRAINT_NAME FROM  information_schema.constraint_column_usage
where table_name = 'usuarios_acesso' and column_name = 'acesso_id'
  AND constraint_name<> 'unique_acesso_user';