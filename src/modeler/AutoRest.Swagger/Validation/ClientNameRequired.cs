﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using AutoRest.Core.Logging;
using AutoRest.Core.Properties;
using AutoRest.Core.Validation;
using AutoRest.Swagger.Model;

namespace AutoRest.Swagger.Validation
{
    public class NonEmptyClientName : TypedRule<SwaggerObject>
    {
        public override bool IsValid(SwaggerObject entity)
        {
            bool valid = true;

            object clientName = null;
            if (entity != null && entity.Extensions != null && entity.Extensions.TryGetValue("x-ms-client-name", out clientName))
            {
                var ext = clientName as Newtonsoft.Json.Linq.JContainer;
                if (ext != null && (ext["name"] == null || string.IsNullOrEmpty(ext["name"].ToString())))
                {
                    valid = false;
                }
                else if (string.IsNullOrEmpty(clientName as string))
                {
                    valid = false;
                }
            }

            return valid;
        }

        /// <summary>
        /// The template message for this Rule. 
        /// </summary>
        /// <remarks>
        /// This may contain placeholders '{0}' for parameterized messages.
        /// </remarks>
        public override string MessageTemplate => Resources.EmptyClientName;

        /// <summary>
        /// The severity of this message (ie, debug/info/warning/error/fatal, etc)
        /// </summary>
        public override LogEntrySeverity Severity => LogEntrySeverity.Warning;

    }
}