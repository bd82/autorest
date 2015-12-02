/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.AzureServiceResponseBuilder;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.serializer.JacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import fixtures.azureparametergrouping.models.Error;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class ParameterGroupingOperationsImpl implements ParameterGroupingOperations {
    private ParameterGroupingService service;
    AutoRestParameterGroupingTestService client;

    public ParameterGroupingOperationsImpl(Retrofit retrofit, AutoRestParameterGroupingTestService client) {
        this.service = retrofit.create(ParameterGroupingService.class);
        this.client = client;
    }

    /**
     * Post a bunch of required parameters grouped
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     */
    public ServiceResponse<Void> postRequired(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) throws ServiceException, IOException, IllegalArgumentException {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.getBody();
        String customHeader = parameterGroupingPostRequiredParameters.getCustomHeader();
        int query = parameterGroupingPostRequiredParameters.getQuery();
        String path = parameterGroupingPostRequiredParameters.getPath();
        Call<ResponseBody> call = service.postRequired(path, this.client.getAcceptLanguage(), body, customHeader, query);
        return postRequiredDelegate(call.execute(), null);
    }

    /**
     * Post a bunch of required parameters grouped
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postRequiredAsync(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) {
        if (parameterGroupingPostRequiredParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null."));
            return null;
        }
        Validator.validate(parameterGroupingPostRequiredParameters, serviceCallback);
        int body = parameterGroupingPostRequiredParameters.getBody();
        String customHeader = parameterGroupingPostRequiredParameters.getCustomHeader();
        int query = parameterGroupingPostRequiredParameters.getQuery();
        String path = parameterGroupingPostRequiredParameters.getPath();
        Call<ResponseBody> call = service.postRequired(path, this.client.getAcceptLanguage(), body, customHeader, query);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postRequiredDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> postOptional(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) throws ServiceException, IOException {
        String customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
        int query = parameterGroupingPostOptionalParameters.getQuery();
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        return postOptionalDelegate(call.execute(), null);
    }

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postOptionalAsync(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        String customHeader = parameterGroupingPostOptionalParameters.getCustomHeader();
        int query = parameterGroupingPostOptionalParameters.getQuery();
        Call<ResponseBody> call = service.postOptional(this.client.getAcceptLanguage(), customHeader, query);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postOptionalDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultipleParameterGroupsSecondParameterGroup Additional parameters for the operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> postMultipleParameterGroups(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup parameterGroupingPostMultipleParameterGroupsSecondParameterGroup) throws ServiceException, IOException {
        String headerOne = firstParameterGroup.getHeaderOne();
        int queryOne = firstParameterGroup.getQueryOne();
        String headerTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getHeaderTwo();
        int queryTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getQueryTwo();
        Call<ResponseBody> call = service.postMultipleParameterGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        return postMultipleParameterGroupsDelegate(call.execute(), null);
    }

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultipleParameterGroupsSecondParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postMultipleParameterGroupsAsync(FirstParameterGroup firstParameterGroup, ParameterGroupingPostMultipleParameterGroupsSecondParameterGroup parameterGroupingPostMultipleParameterGroupsSecondParameterGroup, final ServiceCallback<Void> serviceCallback) {
        String headerOne = firstParameterGroup.getHeaderOne();
        int queryOne = firstParameterGroup.getQueryOne();
        String headerTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getHeaderTwo();
        int queryTwo = parameterGroupingPostMultipleParameterGroupsSecondParameterGroup.getQueryTwo();
        Call<ResponseBody> call = service.postMultipleParameterGroups(this.client.getAcceptLanguage(), headerOne, queryOne, headerTwo, queryTwo);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postMultipleParameterGroupsDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMultipleParameterGroupsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Post parameters with a shared parameter group object
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     */
    public ServiceResponse<Void> postSharedParameterGroupObject(FirstParameterGroup firstParameterGroup) throws ServiceException, IOException {
        String headerOne = firstParameterGroup.getHeaderOne();
        int queryOne = firstParameterGroup.getQueryOne();
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        return postSharedParameterGroupObjectDelegate(call.execute(), null);
    }

    /**
     * Post parameters with a shared parameter group object
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        String headerOne = firstParameterGroup.getHeaderOne();
        int queryOne = firstParameterGroup.getQueryOne();
        Call<ResponseBody> call = service.postSharedParameterGroupObject(this.client.getAcceptLanguage(), headerOne, queryOne);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postSharedParameterGroupObjectDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postSharedParameterGroupObjectDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new AzureServiceResponseBuilder<Void>(new AzureJacksonUtils())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}