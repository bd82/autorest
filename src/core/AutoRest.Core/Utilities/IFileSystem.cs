﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.IO;

namespace AutoRest.Core.Utilities
{
    public interface IFileSystem
    {
        bool IsCompletePath(string path);

        void WriteAllText(string path, string contents);

        string ReadAllText(string path);

        TextWriter GetTextWriter(string path);

        bool FileExists(string path);

        void DeleteFile(string path);

        bool DirectoryExists(string path);

        void CreateDirectory(string path);

        string MakePathRooted(Uri rootPath, string relativePath);

        string[] GetDirectories(string startDirectory, string filePattern, SearchOption options);

        string[] GetFiles(string startDirectory, string filePattern, SearchOption options);

        string CurrentDirectory { get; }

        Uri GetParentDir(string path);
    }
}