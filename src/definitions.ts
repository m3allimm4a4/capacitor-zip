export interface CapacitorZipPlugin {
  unzip(options: UnzipOptions): Promise<UnzipResult>;
}

export interface UnzipOptions {
  source: string;
  destination: string;
  password?: string;
}

export interface UnzipResult {
  message: string;
  uri?: string;
}

/*
 * @enum {string}
 */
export enum ZipErrorCodes {
  SUCCESS = 'SUCCESS',
  NO_SOURCE_SPECIFIED = 'NO_SOURCE_SPECIFIED',
  NO_DESTINATION_SPECIFIED = 'NO_DESTINATION_SPECIFIED',
  NO_PASSWORD_SPECIFIED = 'NO_PASSWORD_SPECIFIED',
  NO_PERMISSION = 'NO_PERMISSION',
  NO_FILE_EXISTS = 'NO_FILE_EXISTS',
  NO_FILE_VALID = 'NO_FILE_VALID',
  UNKNOWN_ERROR = 'UNKNOWN_ERROR',
}
