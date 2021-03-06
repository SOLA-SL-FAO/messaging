/**
 * ******************************************************************************************
 * Copyright (C) 2015 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.common.messaging;

/**
 * Contains message codes for messages raised from the services.
 * @author soladev
 */
public class ServiceMessage {

    // Service message prefix
    public static final String MSG_PREFIX = "ser";
    
    // Message groups
    private static final String TEST = MSG_PREFIX + "test";
    private static final String GENERAL = MSG_PREFIX + "gnrl";
    private static final String EXCEPTION = MSG_PREFIX + "excp";
    private static final String RULE = MSG_PREFIX + "rule";
    private static final String EJB_APPLICATION = MSG_PREFIX + "ejbapplication";
    private static final String EJB_SOURCE = MSG_PREFIX + "ejbsource";
    private static final String EJB_TRANSACTION = MSG_PREFIX + "ejbtransaction";
    private static final String ADMIN_WS = MSG_PREFIX + "adminservice";
    private static final String OT_WS = MSG_PREFIX + "_ot";
    private static final String REDACT = MSG_PREFIX + "redact";
    
    // <editor-fold defaultstate="collapsed" desc="Test Messages">  
    /** sertest001 - Unit Test Message */
    public static final String TEST001 = TEST + "001";
    /** sertest002 - Unit Test Message */
    public static final String TEST002 = TEST + "002";
    /** sertest003 - Unit Test Message */
    public static final String TEST003 = TEST + "003";
    /** sertest004 - Unit Test Message */
    public static final String TEST004 = TEST + "004";
    /** sertest005 - Unit Test Message */
    public static final String TEST005 = TEST + "005";
    /** sertest006 - Unit Test Message */
    public static final String TEST006 = TEST + "006";
    /** sertest007 - Unit Test Message */
    public static final String TEST007 = TEST + "007";
    // </editor-fold>
    
    // General Messages
    /** sergnrl001 - An unexpected error has occurred. */
    public static final String GENERAL_UNEXPECTED = GENERAL + "001";
    /** sergnrl002 - Your changes cannot be saved as the record you are editing has been changed 
                     by someone else. */
    public static final String GENERAL_OPTIMISTIC_LOCK = GENERAL + "002";
    /** sergnrl003 - An unexpected error has occurred while performing {0}. Error details: {1} */
    public static final String GENERAL_UNEXPECTED_ERROR_DETAILS = GENERAL + "003";
    /** sergnrl004 - An unexpected error has occurred while performing {0}. Error details: {1} */
    public static final String GENERAL_UNEXPECTED_ERROR_DETAILS_ERR_NUM = GENERAL + "004";
    /** sergnrl005 - Your account is not active. If you just registered, you need to activate it first. */
    public static final String GENERAL_ACCOUNT_LOCKED = GENERAL + "005";
    /** sergnrl006 - Provided object is null. */
    public static final String GENERAL_OBJECT_IS_NULL = GENERAL + "006";
    /** sergnrl007 - Object already exists. */
    public static final String GENERAL_OBJECT_EXIST = GENERAL + "007";
    /** sergnrl008 - File size is wrong. */
    public static final String GENERAL_WRONG_FILE_SIZE = GENERAL + "008";
    /** sergnrl009 - MD5 is not matching. */
    public static final String GENERAL_WRONG_MD5 = GENERAL + "009";
    
    // Exception Messages
    /** serexcp001 - An error occurred while logging an exception. Error details: {0} */
    public static final String EXCEPTION_FAILED_LOGGING = EXCEPTION + "001";
    /** serexcp002 - An error occurred while formatting an exception. Error details: {0}. */
    public static final String EXCEPTION_FAILED_FORMATTING = EXCEPTION + "002";
    /** serexcp003 - The service url is malformed. Error details: {1} */
    public static final String EXCEPTION_MALFORMED_URL = EXCEPTION + "003";
    /** serexcp004 - The username and password are incorrect. */
    public static final String EXCEPTION_AUTHENTICATION_FAILED = EXCEPTION + "004";
    /** serexcp005 - Unable to connect to the service at {0}. Error details: {1} */
    public static final String EXCEPTION_SERVICE_CONNECTION = EXCEPTION + "005";
    /** serexcp006 - You do not have enough rights to access this function. */
    public static final String EXCEPTION_INSUFFICIENT_RIGHTS = EXCEPTION + "006";
    /** serexcp007 - Entity does not belong to the called EJB. */
    public static final String EXCEPTION_ENTITY_PACKAGE_VIOLATION = EXCEPTION + "007";
    /** serexcp008 - Unable to initialize web service client for service {0}. Error details: {1} */
    public static final String EXCEPTION_INITALIZE_WSCLIENT = EXCEPTION + "008";
    /* serexcp009 - The username and password are incorrect. */
    public static final String EXCEPTION_INVALID_SECURITY_HEADER = EXCEPTION + "009";
    /* serexcp010 - The file cannot be attached due to its size ({0}MB) */
    public static final String EXCEPTION_FILE_TOO_BIG = EXCEPTION + "010";
    /* serexcp020 - The file cannot be attached due to its size ({0}MB) */
    public static final String EXCEPTION_NETWORK_SCAN_FOLDER = EXCEPTION + "020";
    /** serexcp021 - You can't do changes to the object belonging to another user. */
    public static final String EXCEPTION_OBJECT_ACCESS_RIGHTS = EXCEPTION + "021";
    
    // Business Rule Messages
    /** serrule001 - Business rule {0} does not exist.*/
    public static final String RULE_NOT_FOUND = RULE + "001";
    /** serrule002 - Business rule {0} did not execute successfully.*/
    public static final String RULE_FAILED_EXECUTION = RULE + "002";
    /** serrule003 - Validation failed.*/
    public static final String RULE_VALIDATION_FAILED = RULE + "003";

    // ApplicationEJB Messages
    /** serejbapplication001 - Service does not exist.*/
    public static final String EJB_APPLICATION_SERVICE_NOT_FOUND = EJB_APPLICATION + "001";
    /** serejbapplication002 - Application is not found.*/
    public static final String EJB_APPLICATION_APPLICATION_NOT_FOUND = EJB_APPLICATION + "002";
    /** serejbapplication003 - Only information service requests can be handled.*/
    public static final String EJB_APPLICATION_SERVICE_REQUEST_TYPE_INFORMATION_REQUIRED = EJB_APPLICATION + "003";

    //SourceEJB Messages
    /** serejbsource001 - Source does not exist. */
    public static final String EJB_SOURCE_SOURCE_NOT_FOUND = EJB_SOURCE + "001";
    /** serejbsource002 - Source is not in pending status. */
    public static final String EJB_SOURCE_SOURCE_NOT_PENDING = EJB_SOURCE + "002";

    //TransactionEJB Messages
    /** serejbtransaction001 - Source does not exist. */
    public static final String EJB_TRANSACTION_TRANSACTION_NOT_FOUND = EJB_TRANSACTION + "001";
    
    //TransactionEJB Messages
    /** serejbtransaction002 - This transaction cannot be rejected. */
    public static final String EJB_TRANSACTION_NOT_REJECTABLE= EJB_TRANSACTION + "002";
    
    // Admin Web-service
    /** seradminservice001 - Username "{0}" already exists. */
    public static final String ADMIN_WS_USER_EXISTS = ADMIN_WS + "001";
    
    // OT Web-service
    /** ser_ot001 - Malformed JSON input. Failed to convert. */
    public static final String OT_WS_BAD_JSON = OT_WS + "001";
    
    /** ser_ot002 - Requested object was not found. */
    public static final String OT_WS_NOT_FOUND = OT_WS + "002";
    
    /** ser_ot003 - Missing attachments on the claim were found. */
    public static final String OT_WS_MISSING_CLAIM_ATTACHMENTS = OT_WS + "003";
    
    /** ser_ot004 - Attachments were not found on the server. */
    public static final String OT_WS_MISSING_SERVER_ATTACHMENTS = OT_WS + "004";
    
    /** ser_ot005 - Chunk is null or empty. */
    public static final String OT_WS_CHUNK_EMPTY = OT_WS + "005";
    
    /** ser_ot006 - Chunk size is wrong. */
    public static final String OT_WS_CHUNK_SIZE_WRONG = OT_WS + "006";
    
    /** ser_ot007 - Chunk MD5 is wrong. */
    public static final String OT_WS_CHUNK_MD5_WRONG = OT_WS + "007";
    
    /** ser_ot008 - Chunk already exists. */
    public static final String OT_WS_CHUNK_EXISTS = OT_WS + "008";
    
    /** ser_ot009 - Chunk doesn't belong to attachment owned by the current user. */
    public static final String OT_WS_CHUNK_ATTACHMENT_OWNED_BY_OTHER_USER = OT_WS + "009";
    
    /** ser_ot010 - Chunk start position is not following last chunk end. */
    public static final String OT_WS_CHUNK_WRONG_START_POSITION = OT_WS + "010";
    
    /** ser_ot011 - Chunk size is too large. Resize your chunks. */
    public static final String OT_WS_CHUNK_LARGE_SIZE = OT_WS + "011";
    
    /** ser_ot012 - You have reached the limit of files loading. Try after a day. */
    public static final String OT_WS_FILES_LOADING_LIMIT = OT_WS + "012";
    
    /** ser_ot013 - Some of the required fields are null or empty. */
    public static final String OT_WS_EMPTY_REQUIRED_FIELDS = OT_WS + "013";
    
    /** ser_ot014 - Chunk start position must be greater than 0. */
    public static final String OT_WS_CHUNK_START_POSITION_ZERO = OT_WS + "014";
    
    /** ser_ot015 - Challenged claim doesn't exist. */
    public static final String OT_WS_CHALLENGED_CLAIM_NOT_FOUND = OT_WS + "015";
    
    /** ser_ot016 - Challenged claim moderation period has expired. */
    public static final String OT_WS_CHALLENGED_CLAIM_LOCKED = OT_WS + "016";
    
    /** ser_ot017 - Claim moderation period has expired. */
    public static final String OT_WS_CLAIM_LOCKED = OT_WS + "017";
    
    /** ser_ot018 - Attachment chunks not found. */
    public static final String OT_WS_CHUNKS_NOT_FOUND = OT_WS + "018";

    /** serredact001 - Restricted. */
    public static final String REDACT_RESTRICTED = REDACT + "001";
    /** serredact002 - Not Applicable. */
    public static final String REDACT_GENDER = REDACT + "002";
    /** serredact003 - JAN 1, 1800 00:00. */
    public static final String REDACT_DATE_OF_BIRTH = REDACT + "003";
    /** serredact004 - MMM d, yyyy HH:mm */
    public static final String REDACT_DATE_FORMAT = REDACT + "004";
}
