import { WebPlugin } from '@capacitor/core';

import type { CapacitorZipPlugin, UnzipResult } from './definitions';

export class CapacitorZipWeb extends WebPlugin implements CapacitorZipPlugin {
  /*
   * @param {UnzipOptions} options - The shape is the same as the UnzipOptions interface
   * @returns {Promise<UnzipResult>} - The shape is the same as the UnzipResult interface
   */
  async unzip(): Promise<UnzipResult> {
    return Promise.reject(new Error('Only available on android'));
  }
}
