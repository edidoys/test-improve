package com.doys.improve.utils;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CsvUtils {

  public static <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
    CsvMapper mapper = new CsvMapper();
    CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
    ObjectReader reader = mapper.readerFor(clazz).with(schema);
    return reader.<T>readValues(stream).readAll();
  }
}