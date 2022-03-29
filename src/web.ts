import { WebPlugin } from '@capacitor/core';

import type { CapacitorZipPlugin, UnzipResult } from './definitions';

export class CapacitorZipWeb extends WebPlugin implements CapacitorZipPlugin {
  async unzip(): Promise<UnzipResult> {
    return Promise.reject(new Error('Only available on android'));
  }
}
