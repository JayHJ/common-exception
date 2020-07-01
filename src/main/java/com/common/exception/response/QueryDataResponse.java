package com.common.exception.response;

import com.common.exception.entities.QueryData;

/**
 * for query data response which will have pagination function
 */
public class QueryDataResponse<T> extends CommonResponse<QueryData<T>>  {
    public QueryDataResponse() {
    }

    public QueryDataResponse(QueryData<T> data) {
        super(data);
    }
}
